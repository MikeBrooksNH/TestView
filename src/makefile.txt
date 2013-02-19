CC =  /usr/local/bin/gcc 
CFLAGS = -c -O
MAKEFLAGS = b
objects = bar.o foo.o

release: clean all

all:  $(objects)

	%.o : %.c
	$(CC) $(CFLAGS) -o obj/$@ $< 
	ld obj/*.o -o ../bin/foo

clean:
	rm obj/*
	rm ../bin/foo
 
SUFFIXES: .c .o

