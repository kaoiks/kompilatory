grammar PolskiJS;

prog: block
;

block: stat*
;

stat: ID '=' assignment_value ';'           #assign
    | PRINT ID ';'  		                #write     
    | READ ID ';' 		                    #read   
    | IF compare_equality '{' ifblock '}'  #if
    ;

ifblock: block;

compare_equality: ID '==' INT    #isEqual
;

assignment_value:  value
      | arithmetic_operation
;

arithmetic_operation:  value        #singleValue
    | value ADD value               #add
    | value MULT value              #mult
;

value: INT      #int
    | REAL      #real 
;	

PRINT: 'wyświetl' 
    ;
READ: 'wczytaj'
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

IF:	'jeżeli'
;

WS : [ \t\r\n]+ -> skip;
