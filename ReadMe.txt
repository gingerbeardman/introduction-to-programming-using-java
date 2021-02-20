----------------
The Source Files
----------------

The source files correspond to those in the text, with any
errors corrected. All code has been compiled using JDK 1.1.

In addition to the complete class definitions presented in the
text, many code fragments (small portions of code not forming
a complete class definition) have been fleshed out to 
form complete classes which can be compiled and executed.

Finally, the output of most programs have been placed in files
with a '.out' suffix, and a file name matching the corresponding
class. Thus, the output of the class Program1 may be found in
Program1.out. If the class illustrates an error (compile-time
or run-time), the output (compiler or execution) may be found
in a file with suffix '.err'.

-----------------------------------
Navigating Through the Source Files
-----------------------------------

Java requires that the name of a class match the name of
source file containing the class definition (we will restrict
ourselves to one class per source file). Thus, the source for
class Program1 should be contained in a file named Program1.java.

Occasionally the text presents several versions of the same
class (for example the Program1 class of Chapter 1). In this case
various versions of the class will be contained in files named
after the class but with a numeric suffix. For example, for the 
class Program1, the various versions are contained in files
named Program1_1.java, Program1_2.java, and so on. In order to 
successfully compile one of these versions, the corresponding 
source file must be renamed to a name matching the actual class. 
Thus, if you wish to compile (and run) the Program1 class definition 
contained in the file Program1_2.java, you must first rename 
(or copy) that file to Program1.java.

Fragments of code which are fleshed out have no class name in 
the text. We therefore assign a class (and source file) name 
based upon the chapter and section where the fragment appears. 
For example, the first fragment of Section 3.2 would be named
Chapter3_2_1 (the 3 corresponding to the chapter, the 2 to 
the section and the 1 to fragment being the first in the 
section). Similarly, the class name Chapter4_7_1_2 corresponds to
the second fragment of Section 4.7.1.

------------------
Source File Format
------------------

Each source file has a leading set of comments stating the
chapter, section, and page(s) where the code appears in the
text. 

A Notes comment contains any relevant information including:

- Any required renaming of the source file name (see Naviagting 
	the Source Files above).
- Any errors in the code as it appears in the text, and the 
	correction.
- Any other discrepencies between the source file and the version
	in the text.
- Whether the class corrsponds to a code fragment. 
- Any other classes required to successfully compile and execute
	the class.


