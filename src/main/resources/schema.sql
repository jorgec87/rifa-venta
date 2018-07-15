

/***
create table student
(
   id integer not null,
   name varchar(255) not null,
   passport varchar(255) not null,
   primary key(id)
);



CREATE TABLE [dbo].[COMPRADOR](
	[rut] [int] NOT NULL,
	[nombre] [varchar](250) NULL,
	[apellido] [varchar](250) NULL,
	[telefono] [varchar](11) NULL,
	[email] [varchar](100) NULL,
 CONSTRAINT [PK_COMPRADOR] PRIMARY KEY CLUSTERED 
(
	[rut] ASC
)WITH (STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]


CREATE TABLE [dbo].[VENTA](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[rifa] [int] NULL,
	[comprador] [int] NULL,
	[numero] [int] NULL,
	[fecha] [date] NULL,
	[vendedor] [int] NULL,
 CONSTRAINT [PK_VENTA] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]


ALTER TABLE [dbo].[VENTA]  WITH CHECK ADD  CONSTRAINT [FK_VENTA_COMPRADOR] FOREIGN KEY([comprador])
REFERENCES [dbo].[COMPRADOR] ([rut])


ALTER TABLE [dbo].[VENTA] CHECK CONSTRAINT [FK_VENTA_COMPRADOR]

**/
