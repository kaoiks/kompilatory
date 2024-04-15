grammar PolskiJS;

prog: ( stat? NEWLINE )* 
;

stat: ID '=' assignment_value ';' #assign
    | PRINT ID ';'  		      #write     
    | READ ID ';' 		          #read        
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
    | STRING    #string
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

STRING :  '"' ( ~('\\'|'"') )* '"'
    ;

ADD: '+'
    ;

MULT: '*'
    ;

NEWLINE: '\r'? '\n'
    ;

WS: (' '|'\t')+ { skip(); }
    ;
