/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     31/01/2016 22:07:06                          */
/*==============================================================*/


drop table if exists ABONO_DEUDA;

drop table if exists CLIENTE;

drop table if exists FORMA_DE_PAGO;

drop table if exists GESTION;

drop table if exists MORA;

drop table if exists RESPUESTA;

drop table if exists RESULTADO;

drop table if exists TIPO_GESTION;

drop table if exists USUARIO_UNIDAD_NEGOCIO;

/*==============================================================*/
/* Table: ABONO_DEUDA                                           */
/*==============================================================*/
create table ABONO_DEUDA
(
   ID_ABONODEUDA        int not null,
   ID_FORMAPAGO         int,
   ID_MORA              int,
   FECHAABONO           date,
   ABONO                float(8,2),
   primary key (ID_ABONODEUDA)
);

/*==============================================================*/
/* Table: CLIENTE                                               */
/*==============================================================*/
create table CLIENTE
(
   ID_CLIENTE           int not null,
   CEDULA_RUC           int,
   COD_CLIENTE          int,
   TELEFONO             numeric(8,0),
   TELF_REF1            numeric(8,0),
   TELF_REF2            numeric(8,0),
   DIRECCION            varchar(256),
   REGISTROACTIVOCLIENTE varchar(1024),
   primary key (ID_CLIENTE)
);

/*==============================================================*/
/* Table: FORMA_DE_PAGO                                         */
/*==============================================================*/
create table FORMA_DE_PAGO
(
   ID_FORMAPAGO         int not null,
   NOMBREFORMA          varchar(1024),
   REGISTROACTIVO       varchar(1024),
   primary key (ID_FORMAPAGO)
);

/*==============================================================*/
/* Table: GESTION                                               */
/*==============================================================*/
create table GESTION
(
   ID_GESTION           int not null,
   ID_RESPUESTA         int,
   ID_MORA              int,
   ID_TIPOGESTION       int,
   ID_RESULTADO         int,
   FECHAGESTION         date,
   OBSERVACIONES        varchar(500),
   primary key (ID_GESTION)
);

/*==============================================================*/
/* Table: MORA                                                  */
/*==============================================================*/
create table MORA
(
   ID_MORA              int not null,
   ID_USUARIOUNIDADNEGOCIO int,
   ID_CLIENTE           int,
   DESCRIPCION          varchar(200),
   NUMFACTURA           numeric(8,0),
   FECHAFACTURACION     date,
   PLAZO                date,
   DIASENMORA           numeric(8,0),
   SALDOTOTALFACTURAMORA float(8,2),
   primary key (ID_MORA)
);

/*==============================================================*/
/* Table: RESPUESTA                                             */
/*==============================================================*/
create table RESPUESTA
(
   ID_RESPUESTA         int not null,
   ID_GESTION           int,
   RESPUESTACLIENTE     varchar(300),
   FECHACOMPROMISOPAGO  date,
   FECHARESPUESTA       date,
   primary key (ID_RESPUESTA)
);

/*==============================================================*/
/* Table: RESULTADO                                             */
/*==============================================================*/
create table RESULTADO
(
   ID_RESULTADO         int not null,
   ID_TIPOGESTION       int,
   NOMBRERESULTADO      varchar(300),
   REGISTROACTIVORESULTADO varchar(30),
   primary key (ID_RESULTADO)
);

/*==============================================================*/
/* Table: TIPO_GESTION                                          */
/*==============================================================*/
create table TIPO_GESTION
(
   ID_TIPOGESTION       int not null,
   NOMBREGESTION        varchar(300),
   REGISTROACTIVOGESTION varchar(30),
   primary key (ID_TIPOGESTION)
);

/*==============================================================*/
/* Table: USUARIO_UNIDAD_NEGOCIO                                */
/*==============================================================*/
create table USUARIO_UNIDAD_NEGOCIO
(
   ID_USUARIOUNIDADNEGOCIO int not null,
   ID_USUARIO           int,
   ID_UNIDADNEGOCIO     int,
   ACTIVO               varchar(30),
   primary key (ID_USUARIOUNIDADNEGOCIO)
);

alter table ABONO_DEUDA add constraint FK_RELATIONSHIP_4 foreign key (ID_MORA)
      references MORA (ID_MORA) on delete restrict on update restrict;

alter table ABONO_DEUDA add constraint FK_RELATIONSHIP_5 foreign key (ID_FORMAPAGO)
      references FORMA_DE_PAGO (ID_FORMAPAGO) on delete restrict on update restrict;

alter table GESTION add constraint FK_RELATIONSHIP_2 foreign key (ID_MORA)
      references MORA (ID_MORA) on delete restrict on update restrict;

alter table GESTION add constraint FK_RELATIONSHIP_3 foreign key (ID_RESULTADO)
      references RESULTADO (ID_RESULTADO) on delete restrict on update restrict;

alter table GESTION add constraint FK_RELATIONSHIP_6 foreign key (ID_RESPUESTA)
      references RESPUESTA (ID_RESPUESTA) on delete restrict on update restrict;

alter table GESTION add constraint FK_RELATIONSHIP_9 foreign key (ID_TIPOGESTION)
      references TIPO_GESTION (ID_TIPOGESTION) on delete restrict on update restrict;

alter table MORA add constraint FK_RELATIONSHIP_1 foreign key (ID_CLIENTE)
      references CLIENTE (ID_CLIENTE) on delete restrict on update restrict;

alter table MORA add constraint FK_RELATIONSHIP_8 foreign key (ID_USUARIOUNIDADNEGOCIO)
      references USUARIO_UNIDAD_NEGOCIO (ID_USUARIOUNIDADNEGOCIO) on delete restrict on update restrict;

alter table RESPUESTA add constraint FK_RELATIONSHIP_7 foreign key (ID_GESTION)
      references GESTION (ID_GESTION) on delete restrict on update restrict;

alter table RESULTADO add constraint FK_RELATIONSHIP_10 foreign key (ID_TIPOGESTION)
      references TIPO_GESTION (ID_TIPOGESTION) on delete restrict on update restrict;

