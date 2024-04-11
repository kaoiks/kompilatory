grammar PolskiJS;

prog: statement+;

statement: ID '=' INT;

ID: [a-zA-Z]+;

INT: [0-9]+;

WS: [\t\r\n]+ -> skip;

