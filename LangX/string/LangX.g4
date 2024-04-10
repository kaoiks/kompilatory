grammar LangX;

prog: ( stat? NEWLINE )* 
    ;

stat:	WRITE ID		#write
	| READ ID   		#read
 	| ID '=' expr		#assign
  ;

expr: value ADD value		#add
	| value		 	#single
   ;

value: ID
       | INT
       | STRING
   ;	

WRITE:	'write' 
   ;

READ:	'read' 
   ;
   
ID:   ('a'..'z'|'A'..'Z')+
   ;

INT:   '0'..'9'+
    ;

ADD: '+'
    ;

STRING :  '"' ( ~('\\'|'"') )* '"'
    ;

NEWLINE:	'\r'? '\n'
    ;

WS:   (' '|'\t')+ { skip(); }
    ;


prog:   (stat NEWLINE)*;

stat:   przypisanie
    |   wyrazenie
    |   wejscieWyjscie
    ;

przypisanie: IDZMIENNEJ '=' wyrazenie ';' ;

wyrazenie: wyrazenie ('+' | '-' | '*' | '/') wyrazenie
         | INT
         | FLOAT
         | IDZMIENNEJ
         | '(' wyrazenie ')'
         ;

wejscieWyjscie:   ('czytaj' IDZMIENNEJ
                | 'drukuj' wyrazenie)
                ';' ;

INT:    [0-9]+ ;
FLOAT:  [0-9]+'.'[0-9]+ ;
IDZMIENNEJ: [a-zA-Z_][a-zA-Z_0-9]* ;
WS:     [ \t\r\n]+ -> skip ;