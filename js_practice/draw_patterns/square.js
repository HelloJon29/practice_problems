let n = 5;
let string = "";
for (let i = 0; i < n; i++) {
  string = "*";
  for (let j = 0; j < n - 1; j++) {
    string += "*";
  }
  console.log(string);
}
