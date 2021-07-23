create table tbl_board (
       bno bigint not null auto_increment,
   bstate bit not null,
        btitle varchar(255) not null,
        bcontent varchar(255) not null,
        bprice varchar(255) not null,
        bdeleted bit not null,
        breg_date datetime(6),
        bmod_date datetime(6),
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
        mreg_date datetime(6),
        mmod_date datetime(6),
                primary key (mno)

    );
    
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
       
       
       
           create table tbl_reply (
        rno bigint not null auto_increment,
        rtext varchar(255) not null,
        rdeleted bit not null,
        board_bno bigint,
        member_mno bigint,
        rmod_date datetime(6),
        rreg_date datetime(6),
        primary key (rno)
    ) ;
    
        create table tbl_file (
        fno bigint not null auto_increment, 
        fuuid varchar(255) not null,
        fname varchar(255) not null,
        fmain bit,
        fmod_date datetime(6),
        freg_date datetime(6),
        board_bno bigint,
        primary key (fno)
    );
    
    CREATE TABLE tbl_cartlist (
       cno BIGINT NOT NULL AUTO_INCREMENT,
       PRIMARY KEY (cno),
       member_mno BIGINT,
       board_bno BIGINT,
       cmod_date datetime(6),
      creg_date datetime(6)
    );
    
    CREATE TABLE tbl_applylist (
       ano BIGINT NOT NULL AUTO_INCREMENT,
       PRIMARY KEY (ano),
       atext VARCHAR(255) NOT NULL,
       astate INT NOT NULL,
       amod_date datetime(6),
      areg_date datetime(6),
      member_mno BIGINT,
       board_bno BIGINT
    );