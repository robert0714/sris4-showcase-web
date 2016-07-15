drop table client if exists;

CREATE TABLE client 
   (	clientID varchar2(255), 
		clientName VARCHAR2(255 ), 
		clientBornIdentity VARCHAR2(255 ),
		clientBornLoc VARCHAR2(255 ), 
		clientBornOrder VARCHAR2(255 ), 
		clientBornDate VARCHAR2(255 ),
		clientAddress VARCHAR2(255 ), 
		clientMate VARCHAR2(255 ),
		clientFather VARCHAR2(255 ),
		clientMother VARCHAR2(255 ),
		clientNewId VARCHAR2(255 ),
   ) ;
   
   
   
   insert into client ( clientID , clientname , clientbornidentity , clientbornloc , clientbornorder , clientborndate , clientaddress , clientmate , clientfather , clientmother , clientnewid )    
values ( 'H123456789','李威德','已婚','桃園','次男','1987/04/22','我家','我老婆','李威德他爸','李威德他爸','');
   