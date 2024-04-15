ANTLR=../lib/antlr-4.13.1-complete.jar

all: generate compile test

generate:
	java -jar $(ANTLR) -o antlrOutput PolskiJS.g4

compile:
	javac -cp "$(ANTLR):antlrOutput:." *.java -d bin

test:
	java -cp "$(ANTLR):bin" App test.pljs > test.ll

	# Mac version
	/Users/dev/Downloads/clang+llvm-17.0.1-arm64-apple-darwin22.0/bin/lli test.ll

	# Linux version
	# lli-18 test.ll

parsetree:
	java -cp "$(ANTLR):bin" org.antlr.v4.runtime.misc.TestRig Demo prog -gui test.pljs

clean:
	rm test.ll
	rm *.class
	rm -rf output
