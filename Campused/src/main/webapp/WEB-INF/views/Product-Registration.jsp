<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Board Register</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                           게시판 글 등록
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                           <div role="form">
                              <div class="form-group">
                                 <label>제목</label>
                                 <input id="btitle" class="form-control" name='btitle'>
                              </div>
                              <div class="form-group">
                                 <label>글 내용</label>
                                 <textarea id="bcontent" class="form-control" rows="3" name='bcontent'></textarea>
                              </div>
                              <div class="form-group">
                                 <label>가격</label>
                                 <input id="bprice" class="form-control" name='bprice'>
                              </div>
                              <div class="form-group">
                                 <label>작성자</label>
                                 <input id="btitle" class="form-control" name='writer'>
                              </div>
                              <button type="submit" class="btn btn-default">글 등록</button>
                              <button type="reset" class="btn btn-default">리셋</button>
                           </div>
                            
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            
            <!-- 첨부파일 영역 -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">FileAttach</div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="form-group uploadDiv">
                                <input type="file" name="uploadFile" multiple>
                            </div>
                            <div class="uploadResult">
                                <ul>

                                </ul>
                            </div>
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            
            <!-- jQuery CDN -->
			<script src="https://code.jquery.com/jquery-3.6.0.js"
				integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
				crossorigin="anonymous">
				
			</script>
            
            <script>
                $(document).ready(function(e){
                	
                	var formObj = $("div[role='form']");

                    $("button[type='submit']").on("click", function(e){
                            e.preventDefault();
                            
                            var form = {
                    				bstate : true,
                    				btitle : $("#btitle").val(),
                    				bcontent : $("#bcontent").val(),
                    				bprice : $("#bprice").val(),
                    				bdeleted : false,
                    				memberMno : 1,
                    		};
                            console.log("submit clicked>>>>>>>>>>>>>>>>")
                            var str="";
                            
                            form['attachList'] = [];
                            
                            $(".uploadResult ul li").each(function(i, obj){
                            	
                            	var jobj = $(obj);
                            	
                            	var fileObj = {
                            			fuuid:jobj.data("fuuid") 
                            			}
                            	
                            	form['attachList'].push(fileObj)
                            	
                          /*       var jobj = $(obj);
                                console.dir(jobj); // 등록 다시 만들어야함..
                                str += "<input id='fuuid' type='hidden' name='attachList["+i+"].fuuid' value='"+jobj.data("fuuid")+"'>";
                                str += "<input id='fuploadpath' type='hidden' name='attachList["+i+"].fuploadpath' value='"+jobj.data("fuploadpath")+"'>";
                                str += "<input id='fname' type='hidden' name='attachList["+i+"].fname' value='"+jobj.data("fname")+"'>";
                                str += "<input id='ftype' type='hidden' name='attachList["+i+"].ftype' value='"+jobj.data("ftype")+"'>";
                                str += "<input id='fmain' type='hidden' name='attachList["+i+"].fmain' value='"+jobj.data("fmain")+"'>"; */
                            });
                            
                            
                            
                            //form.append(str)
                            //.submit();
                            
                            console.log(form)
         					                   
         /*            		$.ajax({
                            	url: "/board/insert",
                            	contentType: "application/json; charset=UTF-8",
                            	data: JSON.stringify(form),
                            	type: "POST",
                            	dataType: "json",
                            	success: function() {
                            		console.log("success");
                            	}
                            }) */
                            
                    }); // end submit click Event!
                	
                    

                    var regex = new RegExp("(.*?)\.(exe|sh|zip|alz)$");
                    var maxSize = 5242880; // 5MB

                    function checkExtension(fileName, fileSize){
                        if(fileSize >= maxSize){
                            alert("파일 초과");
                            return false;
                        }

                        if(regex.test(fileName)){
                            alert("해당 종류의 파일은 업로드 할수 없습니다.");
                            return false;
                        }
                        return true;
                    }; // end checkExtension()

                    $("input[type='file']").change(function(e){
                        var formData = new FormData();
                        var inputFile = $("input[name='uploadFile']");
                        var files = inputFile[0].files;
                        console.log("check>>>>>>>>")

                        for(var i=0; i<files.length; i++){
                            if(!checkExtension(files[i].name, files[i].size)){
                                return false;
                            }
                            formData.append("uploadFile", files[i]);
                        }

                        $.ajax({
                            url: '/uploadAjaxAction',
                            processData : false,
                            contentType: false,
                            data: formData,
                            type: 'POST',
                            dataType: 'json',
                            success: function(result){
                                console.log(result);
                                showUploadResult(result); // 업로드 결과 처리 함수
                            },
                            error: function() {
                            	console.log("error");
                            }
                        }); // end $.ajax
                        
                    }); // end input Event!

                    function showUploadResult(uploadResultArr){
                        if(!uploadResultArr || uploadResultArr.length == 0){
                            return;
                        }
                        var uploadUL = $(".uploadResult ul");
                        var str = "";
                        $(uploadResultArr).each(function(i, obj){
                            // image type
                            if(obj.ftype){
                                var fileCallPath =  encodeURIComponent(obj.fuploadpath+ "/s_"+obj.fuuid +"_"+obj.fname);
                                str += "<li data-path='"+obj.uploadPath+"'";
                                str +=" data-uuid='"+obj.fuuid+"' data-filename='"+obj.fname+"' data-type='"+obj.ftype+"'"
                                str +" ><div>";
                                str += "<span> "+ obj.fname+"</span>";
                                str += "<button type='button' data-file=\'"+fileCallPath+"\' "
                                str += "data-type='image' class='btn btn-warning btn-circle'>x</button><br>";
                                str += "<img src='/display?fileName="+fileCallPath+"'>";
                                str += "</div>";
                                str +"</li>";
                                console.log(fileCallPath);
                            }else{
                                var fileCallPath =  encodeURIComponent( obj.fuploadpath+"/"+ obj.fuuid +"_"+obj.fname);			      
                                var fileLink = fileCallPath.replace(new RegExp(/\\/g),"/");
                                
                                str += "<li "
                                str += "data-path='"+obj.fuploadpath+"' data-uuid='"+obj.fuuid+"' data-filename='"+obj.fname+"' data-type='"+obj.ftype+"' ><div>";
                                str += "<span> "+ obj.fname+"</span>";
                                str += "<button type='button' data-file=\'"+fileCallPath+"\' data-type='file' " 
                                str += "class='btn btn-warning btn-circle'>x</button><br>";
                                str += "<img src='/resources/img/attach.png'></a>";
                                str += "</div>";
                                str +"</li>";
                            }
                        });
                        uploadUL.append(str);
                    } // end showUploadResult

                    $(".uploadResult").on("click", "button", function(e){
                        console.log("delete----->");
                        var targetFile = $(this).data("file");
                        var type = $(this).data("type");
                        var targetLi = $(this).closest("li");

                        $.ajax({
                            url: '/deleteFile',
                            data: {fileName: targetFile, type: type},
                            dataType: 'text',
                            type: 'POST',
                            success: function(result){
                                alert(result);
                                targetLi.remove();
                            }
                        }); // end $.ajax

                    }); // end uploadResult Event!
                }) // end document.ready
            </script>
</body>
</html>