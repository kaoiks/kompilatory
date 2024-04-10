
ANTLR=antlr-4.13.1-complete.jar

all: generate compile test

generate:
	java -jar $(ANTLR) -o output PolskiJS.g4

compile:
	javac -cp $(ANTLR):output:. Main.java

test:
	java -cp $(ANTLR):output:. Main test.pljs > test.ll
	lli test.ll

parsetree:
	java -cp $(ANTLR):output:. org.antlr.v4.runtime.misc.TestRig Demo prog -gui test.pljs

clean:
	rm test.ll
	rm *.class
	rm -rf output
