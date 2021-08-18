-- day care table
if not exists (select * from sysobjects where name='daycare' and xType='U')
    create table daycare
    (
         daycare_id uniqueidentifier default newsequentialid() not null,
         daycare_name nvarchar(200) not null,
         [address] nvarchar(500) not null,
         phone nvarchar(20) not null,
         admin_name nvarchar(100) not null,
         email nvarchar(200) not null,
         [password] nvarchar(200) not null,
         created_from varchar(20) null default null,
         daycare_unique_name nvarchar(400) not null,
         created_Date datetime not null,
         updated_date datetime null default null,
         CONSTRAINT daycare_pk PRIMARY KEY (daycare_id)
     )
GO

 --daycare additional info
if not exists (select * from sysobjects where name='daycare_info' and xType='U')
    Create table daycare_info
    (
        daycare_info_id int  NOT NULL IDENTITY(1,1),
        daycare_id uniqueidentifier not null,
        about_us nvarchar(500) null,
        [description] nvarchar(2000) null,
        logo_url varchar(500) null,
        created_Date datetime not null,
        updated_date datetime null default null,
        CONSTRAINT daycare_info_pk PRIMARY KEY (daycare_info_id),
        CONSTRAINT fk_daycare_info_daycare foreign key (daycare_id) REFERENCES daycare(daycare_id)
    )
GO

--daycare schedule
if not exists (select * from sysobjects where name='daycare_schedule' and xType='U')
    Create table daycare_schedule
    (
        daycare_schedule_id int  NOT NULL IDENTITY(1,1),
        daycare_id uniqueidentifier not null,
        week_day smallint not null,
        schedule varchar(20) not null,
        created_Date datetime not null,
        updated_date datetime null default null,
        CONSTRAINT daycare_schedule_pk PRIMARY KEY (daycare_schedule_id),
        CONSTRAINT fk_daycare_schedule_daycare foreign key (daycare_id) REFERENCES daycare(daycare_id)
    )
GO

--daycare documents
if not exists (select * from sysobjects where name='daycare_docs' and xType='U')
    Create table daycare_docs
    (
        daycare_doc_id int  NOT NULL IDENTITY(1,1),
        daycare_id uniqueidentifier not null,
        title nvarchar(100) null,
        [description] nvarchar(1000) null,
        doc_url varchar(500) null,
        created_Date datetime not null,
        updated_date datetime null default null,
        CONSTRAINT daycare_docs_pk PRIMARY KEY (daycare_doc_id),
        CONSTRAINT fk_daycare_docs_daycare foreign key (daycare_id) REFERENCES daycare(daycare_id)
    )
GO
