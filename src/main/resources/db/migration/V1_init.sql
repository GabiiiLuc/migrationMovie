CREATE TABLE MOVIE (
        id int not null,
        media_type varchar(255),
        overview varchar(255),
        popularity varchar(255),
        poster_path varchar(255),
        release_date date,
        title varchar(255),
        video boolean,
        vote_average int not null,
        vote_count int not null,
        primary key (id)
);

insert into MOVIE (overview, popularity) values ('Dave', 'Syer');