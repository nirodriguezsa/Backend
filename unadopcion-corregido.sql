


drop table if exists ADOPCION;

drop table if exists ANIMAL;

drop table if exists ANIMAL_VACUNA;

drop table if exists DENUNCIA;

drop table if exists LOGEO;

drop table if exists REGISTRO;

drop table if exists SOLICITUD;

drop table if exists USUARIO;

drop table if exists VACUNA;

drop table if exists VETERINARIA;

/*==============================================================*/
/* Table: ADOPCION                                              */
/*==============================================================*/
create table ADOPCION
(
   ADOP_ID              bigint not null,
   ANIM_ID              bigint not null,
   USUARIO_ID           bigint not null,
   ADOP_FECHA           date not null,
   primary key (ADOP_ID)
);

/*==============================================================*/
/* Table: ANIMAL                                                */
/*==============================================================*/
create table ANIMAL
(
   ANIM_ID              bigint not null,
   ADOP_ID              bigint,
   REGIS_ID             bigint not null,
   ANIM_NOMBRE          char(100) not null,
   ANIM_TIPO            char(100) not null,
   ANIM_LUGAR           char(256) not null,
   ANIM_DESCRIP         char(256) not null,
   ANIM_FOTO            longblob not null,
   ANIM_EDAD            smallint,
   ANIM_SEXO            char(10),
   primary key (ANIM_ID)
);

/*==============================================================*/
/* Table: ANIMAL_VACUNA                                         */
/*==============================================================*/
create table ANIMAL_VACUNA
(
   ANIM_VAC_ID          bigint not null,
   ANIM_ID              bigint not null,
   VACUNA_ID            char(32) not null,
   VET_ID               bigint not null,
   primary key (ANIM_VAC_ID)
);

/*==============================================================*/
/* Table: DENUNCIA                                              */
/*==============================================================*/
create table DENUNCIA
(
   DENUN_ID             bigint not null,
   USUARIO_ID           bigint not null,
   DENUN_FECHA          date not null,
   DENUN_TIPO           char(32),
   DENUN_DESCRIP        char(256) not null,
   primary key (DENUN_ID)
);

/*==============================================================*/
/* Table: LOGEO                                                 */
/*==============================================================*/
create table LOGEO
(
   LOGEO_ID             bigint not null,
   USUARIO_ID           bigint,
   LOGEO_NOMBRE         char(100) not null,
   LOGEO_CONTRA         char(256) not null,
   primary key (LOGEO_ID)
);

/*==============================================================*/
/* Table: REGISTRO                                              */
/*==============================================================*/
create table REGISTRO
(
   REGIS_ID             bigint not null,
   ANIM_ID              bigint,
   REGIS_FECHA          date not null,
   primary key (REGIS_ID)
);

/*==============================================================*/
/* Table: SOLICITUD                                             */
/*==============================================================*/
create table SOLICITUD
(
   SOLICI_ID            bigint not null,
   ANIM_ID              bigint not null,
   SOLICI_FECHA         date not null,
   primary key (SOLICI_ID)
);

/*==============================================================*/
/* Table: USUARIO                                               */
/*==============================================================*/
create table USUARIO
(
   USUARIO_ID           bigint not null,
   LOGEO_ID             bigint not null,
   USUARIO_NOMBRE       char(100) not null,
   USUARIO_ROL          char(32) not null,
   USUARIO_PUNTOS       numeric(8,0) not null,
   USUARIO_EMAIL        char(32),
   USUARIO_TELEFONO     char(15) not null,
   USUARIO_LUGAR        char(256),
   USUARIO_INFO         char(256),
   USUARIO_FOTO         longblob,
   primary key (USUARIO_ID)
);

/*==============================================================*/
/* Table: VACUNA                                                */
/*==============================================================*/
create table VACUNA
(
   VACUNA_ID            char(32) not null,
   VACUNA_FOTO          longblob,
   primary key (VACUNA_ID)
);

/*==============================================================*/
/* Table: VETERINARIA                                           */
/*==============================================================*/
create table VETERINARIA
(
   VET_ID               bigint not null,
   VET_LUGAR            char(256) not null,
   primary key (VET_ID)
);

alter table ADOPCION add constraint FK_ADOPTADO2 foreign key (ANIM_ID)
      references ANIMAL (ANIM_ID) on delete restrict on update restrict;

alter table ADOPCION add constraint FK_ADOPTADOR foreign key (USUARIO_ID)
      references USUARIO (USUARIO_ID) on delete restrict on update restrict;

alter table ANIMAL add constraint FK_ADOPTADO foreign key (ADOP_ID)
      references ADOPCION (ADOP_ID) on delete restrict on update restrict;

alter table ANIMAL add constraint FK_REGISTRADO foreign key (REGIS_ID)
      references REGISTRO (REGIS_ID) on delete restrict on update restrict;

alter table ANIMAL_VACUNA add constraint FK_VACUNADO foreign key (ANIM_ID)
      references ANIMAL (ANIM_ID) on delete restrict on update restrict;

alter table ANIMAL_VACUNA add constraint FK_VACUNA_APLICADA foreign key (VACUNA_ID)
      references VACUNA (VACUNA_ID) on delete restrict on update restrict;

alter table ANIMAL_VACUNA add constraint FK_VET_VACUNA_ANIM foreign key (VET_ID)
      references VETERINARIA (VET_ID) on delete restrict on update restrict;

alter table DENUNCIA add constraint FK_DENUNCIADO foreign key (USUARIO_ID)
      references USUARIO (USUARIO_ID) on delete restrict on update restrict;

alter table LOGEO add constraint FK_LOGEADO2 foreign key (USUARIO_ID)
      references USUARIO (USUARIO_ID) on delete restrict on update restrict;

alter table REGISTRO add constraint FK_REGISTRADO2 foreign key (ANIM_ID)
      references ANIMAL (ANIM_ID) on delete restrict on update restrict;

alter table SOLICITUD add constraint FK_SOLICITADO foreign key (ANIM_ID)
      references ANIMAL (ANIM_ID) on delete restrict on update restrict;

alter table USUARIO add constraint FK_LOGEADO foreign key (LOGEO_ID)
      references LOGEO (LOGEO_ID) on delete restrict on update restrict;

