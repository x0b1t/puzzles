## User Bin Crash

  * Keyword:     `usrbincrash`
  * Difficulty:  `Snack`

You are on a cargo plane full of commercial goods when the pilot announces that the plane is short on fuel. Unless cargo is ejected from the plane, you will run out of fuel and crash. The pilot provides you with the number of pounds of weight that must be ejected from the plane. Fortunately, the manifest of the plane is both completely accurate, digitized, and you are a programmer of some repute. Unfortunately, your boss is going to be extremely unhappy, and wants you to exactly minimize the losses to the absolute minimum possible without crashing the plane. The manifest does not contain the exact quantities of every type of good, because you have so many on board. You may assume that you will not run out of any good in the course of saving the plane. You also realize this kind of program could be handy to others who find themselves in similar situations.
 
Write a program that takes a single argument on the command line. This argument must be a file name, which contains the input data. The program should output to standard out the minimum losses your boss will incur from your ejection of goods (see below). Your program will be tested against several manifests of several crashing planes; each with different data. Additionally, your program must be fast, and give the correct answer.

### Input specifications

The input file will start with an integer number indicating the minimum number of pounds of weight that must be ejected from the plane to prevent a crash, followed by a new line. Each additional line in the file represents a commercial SKU (stock keeping unit) along with its cost (in dollars) and weight (in pounds). The format of these lines is:

<pre>
[SKU label] [weight in pounds] [cost in dollars]  
</pre>

SKUs are represented as a combination of letters (upper and lower case) and numbers. Both costs and weights are integers. Each piece of data in a line is separated by white space. Lines are separated by a single new line character. You are guaranteed your program will run against well formed input files.

Example input file:
<pre>
1250
LJS93K       1300       10500
J38ZZ9       700        4750
HJ394L       200        3250
O1IE82       75         10250
</pre>

### Output specifications

Your boss is not interested in exactly what you ejected to save the plane, he/she is currently only interested in how much it will cost the company. Your program must find the set of goods that will prevent the plane from crashing, and minimize company losses. It should print out the total value of goods lost as a plain integer, followed by a newline. Do not insert commas or dollar signs.

Example output (newline after integer):

<pre>
9500
</pre>

Originally published at [http://www.facebook.com/careers/puzzles.php?puzzle_id=2](http://www.facebook.com/careers/puzzles.php?puzzle_id=2).
