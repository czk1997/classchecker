-- we don't know how to generate root <with-no-name> (class Root) :(
create table classes
(
  CLASS_ID int auto_increment
    primary key,
  SUBJECT varchar(25) null,
  CLASS_URL varchar(255) null,
  TERM int null,
  CLASS_NUM int null,
  CLASS_TITTLE varchar(255) null
);

create table sections
(
  SECTION_ID int auto_increment,
  SEESSION varchar(45) null,
  CLASS_NUM int null,
  UNIT int null,
  GRADING varchar(255) null,
  DESCRIPTION longtext null,
  PREQ mediumtext null,
  REQUIRE_LEC tinyint null,
  REQUIRE_REC tinyint null,
  REQIRE_LAB tinyint null,
  IS_REC tinyint null,
  MEET_MON tinyint null,
  MEET_TUE tinyint null,
  MEET_WED tinyint null,
  MEET_THU tinyint null,
  MEET_FRI tinyint null,
  START_TIME time null,
  END_TIME time null,
  START_DATE date null,
  END_DATE date null,
  ROOM varchar(45) null,
  CAMPUS varchar(45) null,
  LOCATION varchar(45) null,
  TEXTBOOK longtext null,
  CURRENT_STATUS int null,
  CLASS_CAP int null,
  WAITLIST_CAP int null,
  SUBJECT varchar(45) null,
  SUBJECT_NUM int null,
  SECTION_NUM int not null,
  COURSE_NUM int null,
  TERM int not null,
  TITTLE varchar(255) null,
  CLASS_ATTRIBUTE varchar(255) null,
  INSTRUCTOR varchar(255) null,
  CAREER varchar(100) null,
  constraint SECTION_ID_UNIQUE
    unique (SECTION_ID)
);

alter table sections
  add primary key (SECTION_ID);

