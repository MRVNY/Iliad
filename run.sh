[ $(ls *class | wc -w) -gt 0 ] && rm *.class
javac Iliad.java
java Iliad