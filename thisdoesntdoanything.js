// Define a function that does a useless action
function doUselessAction() {
  console.log("Performing a useless action...");
}

// Define a function that repeatedly calls the useless action infinitely
function repeatedlyDoUselessActions() {
  while (true) {
    doUselessAction();
  }
}

// Call the function to start repeatedly doing useless actions infinitely
repeatedlyDoUselessActions();
