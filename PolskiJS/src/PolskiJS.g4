grammar PolskiJS;

prog: block
;

block: (stat | function)*
;

stat: ID '=' assignment_value ';'           #assign
    | ID '=' stringvalue ';'                     #assignString
    | PRINT (ID) ';'  		                #write     
    | READ ID ';' 		                    #read   
    | IF compare_equality '{' ifblock '}'   #if
    | LOOP loopscount TIMES '{' block '}'   #loop
    | CALL ID '();'                         #functionCall
    | PRINT STRING  ';'                      #writeString
    ;

CALL: 'wywołaj'
;

FUNCTION: 'funkcja'
;

function: FUNCTION ID '(' functionargument* ')' '{' functionblock '}'
;

functionargument: ID
;

functionargumentvalue: ID | value
;

functionblock: block
;

TIMES: 'razy'
;

loopscount: loopscountvalue
;

loopscountvalue: ID | INT
;

ifblock: block;

compare_equality: ID '==' INT #isEqual
;

assignment_value:  value
      | arithmetic_operation
;

arithmetic_operation:  value        #singleValue
    | value ADD value               #add
    | value MULT value              #mult
    | value DEDUCT value            #deduct
    | value DIV value               #div
    | ID ADD value                  #addVariable
;

value: INT      #int
    | REAL      #real 
;	

stringvalue: STRING #string
;

PRINT: 'wyświetl' 
;
READ: 'wczytaj'
;

ID: [a-zA-Z]+
;

INT: '0'..'9'+
;

REAL: INT'.'INT
;

ADD: '+'
;

MULT: '*'
;

STRING : '"' ( EscapeSequence | ~["\\] )* '"';
fragment EscapeSequence : '\\' [btnfr"'\\] | UnicodeEscape ;
fragment UnicodeEscape : '\\u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT ;
fragment HEX_DIGIT : [0-9a-fA-F] ;


DEDUCT: '-'
;

DIV: '/'
;

IF:	'jeżeli'
;

LOOP: 'powtórz'
;

WS : [ \t\r\n]+ -> skip;
