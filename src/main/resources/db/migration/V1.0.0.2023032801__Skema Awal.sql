create table tamu (
    id int primary key auto_increment,
    nama varchar(255) not null,
    email varchar(255) not null
);

create table comment (
    id int primary key auto_increment,
    id_tamu int not null,
    waktu DATETIME not null,
    pesan TEXT not null
);