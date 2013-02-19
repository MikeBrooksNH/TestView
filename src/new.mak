CC=/usr/bin/c89
CFLAGS=-c +z
MAKEFLAGS=b
objects=bar.o foo.o
src=bar.c foo.c
#release: clean all

all: $(objects)

$(objects):
	$(CC) $(CFLAGS) -o obj $(src)


#clean:
	#rm obj/*
	#rm ../bin/foo
 
SUFFIXES: .c .o

