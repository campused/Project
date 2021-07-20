create table tbl_board (
       bno bigint not null auto_increment,
   	 bstate bit not null,
       btitle varchar(255) not null,
       bcontent varchar(255) not null,
       bprice varchar(255) not null,
       bdeleted bit not null,
       bregdate datetime(6),
       bmoddate datetime(6),
       member_mno bigint,
       primary key (bno)
    );
        create table tbl_member (
       mno bigint not null auto_increment,
        memail varchar(255) not null,
        mnickname varchar(255) not null,
        mpw varchar(255) not null,
        maddress varchar(255) not null,
        mphone varchar(255) not null,
        mauthority int not null,
        mlikecount bigint,
        mregdate datetime(6),
        mmoddate datetime(6),
        primary key (mno)
    );
    
    create table tbl_reply (
        rno bigint not null auto_increment,
        rtext varchar(255) not null,
        rdeleted bit not null,
        board_bno bigint,
        member_mno bigint,
        rmoddate datetime(6),
        rregdate datetime(6),
        primary key (rno)
    );
    
        create table tbl_file (
        fno bigint not null auto_increment, 
        fuuid varchar(255) not null,
        fname varchar(255) not null,
        fmain bit,
        fmoddate datetime(6),
        fregdate datetime(6),
        board_bno bigint,
        primary key (fno)
    );
    
    CREATE TABLE tbl_cartlist (
       cno BIGINT NOT NULL AUTO_INCREMENT,
       PRIMARY KEY (cno),
       member_mno BIGINT,
       board_bno BIGINT,
       cmoddate datetime(6),
       cregdate datetime(6)
    );
    
    CREATE TABLE tbl_applylist (
       ano BIGINT NOT NULL AUTO_INCREMENT,
       PRIMARY KEY (ano),
       atext VARCHAR(255) NOT NULL,
       astate INT NOT NULL,
       amoddate datetime(6),
       aregdate datetime(6),
       member_mno BIGINT,
       board_bno BIGINT
    );
    
    DROP TABLE tbl_reply;
    
    DROP TABLE tbl_file;
    
    DROP TABLE tbl_cartlist;
    
    DROP TABLE tbl_applylist;
    
    DROP TABLE tbl_board;
    
    DROP TABLE tbl_member;
    
    
        alter table tbl_board 
       add constraint FKd2pummh7bq5j5fgegxvajahq 
       foreign key (member_mno) 
       references tbl_member (mno);
       
         alter table tbl_reply 
       add constraint FKik2sgsfqjfql3nglbdsc9pglg 
       foreign key (board_bno) 
       references tbl_board (bno);
    
          alter table tbl_reply 
       add constraint FKofot4m3mhwhwo8vht7hcvkjii 
       foreign key (member_mno) 
       references tbl_member (mno);
       
           alter table tbl_file
       add constraint FKe57x9w07d77wiyqveufs71dmy 
       foreign key (board_bno) 
       references tbl_board (bno);
       
       ALTER TABLE tbl_cartlist
       ADD constraint
       FOREIGN KEY (board_bno)
       REFERENCES tbl_board (bno);
       
       ALTER TABLE tbl_cartlist
       ADD constraint
       FOREIGN KEY (member_mno)
       REFERENCES tbl_member (mno);
       
       ALTER TABLE tbl_applylist
       ADD constraint
       FOREIGN KEY (member_mno)
       REFERENCES tbl_member (mno);
       
      ALTER TABLE tbl_applylist
       ADD constraint
      FOREIGN KEY (board_bno)
       REFERENCES tbl_board (bno);
       
      TRUNCATE tbl_member;
      
      SELECT * FROM tbl_member WHERE mno = 200;