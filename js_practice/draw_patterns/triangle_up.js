let n = 5;
let string = "";
let spaces = "";
for (let i = 0; i < n; i++) {
  string = spaces + "*"; // draw rows each loop up to 5 *, spaces will draw a blank space in the row instead

  for (let j = 0; j < n - i - 1; j++) {
    // this loop now checks if J is less than n - i - 1, eg first loop is 4 so draw 4 *, 2nd loop is 3 so draw 3 * etc
    string += "*"; //draw columns each loop adding 4 *
  }
  console.log(string);
  spaces += " "; // concat additional space each loop
}

// ***** 5 - 0 - 1 = 4
//  **** 5 - 1 - 1 = 3
//   *** 5 - 2 - 1 = 2
//    **
//     *

// things happening here:
// 1. we draw our rows each outer loop
// 2. at the end of the loop we create a new blank space
// 3. we add the blank space in front of the * each outer loop
// 4. In the inner loop we only draw the rows n - i -1, which will increment downwards drawing * in parralel to the empty spaces added until it draws 1 *
