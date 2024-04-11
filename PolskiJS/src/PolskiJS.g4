grammar PolskiJS;

prog: ( stat? NEWLINE )* 
;

stat:	 ID '=' expr0 ';'		#assign
    | PRINT ID ';'  		#write
    ;

expr0:  expr1			#single0
      | expr1 ADD expr1	#add 
;

expr1:  expr2			#single1
      | expr2 MULT expr2	#mult 
;

expr2:   INT			#int
       | REAL			#real
       | TOINT expr2		#toint
       | TOREAL expr2		#toreal
       | '(' expr0 ')'		#par
;	

PRINT:	'wyświetl' 
    ;

TOINT: '(int)'
    ;

TOREAL: '(real)'
    ;

ID:   ('a'..'z'|'A'..'Z')+
   ;

INT: '0'..'9'+
    ;

REAL: INT'.'INT
    ;


ADD: '+'
    ;

MULT: '*'
    ;

NEWLINE:	'\r'? '\n'
    ;

WS:   (' '|'\t')+ { skip(); }
    ;
