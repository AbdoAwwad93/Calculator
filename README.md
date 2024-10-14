# Java Calculator Project

## Overview
This project implements a simple calculator with a graphical user interface using Java Swing. The calculator provides basic arithmetic operations and a user-friendly interface.

## Features
- Basic arithmetic operations: addition, subtraction, multiplication, and division
- Decimal point support
- Clear display functionality
- On/Off radio buttons (functionality to be implemented)
- User-friendly GUI with a keypad layout

## Project Structure
The project consists of several Java classes:
- `Calculator.java`: Contains the main method to launch the application
- `f.java`: Defines the main frame of the calculator
- `Screen.java`: Implements the display screen and On/Off radio buttons
- `Keypad.java`: Creates the keypad with number and operation buttons
- `MyListener.java`: Handles button click events and performs calculations

## How to Compile and Run
1. Ensure you have Java Development Kit (JDK) installed on your system
2. Compile the Java files using the following command:
   ```
   javac calculator/*.java
   ```
3. Run the compiled program:
   ```
   java calculator.Calculator
   ```

## Usage
1. Launch the calculator application
2. Use the number buttons (0-9) to input numbers
3. Use the operation buttons (+, -, *, /) to select an arithmetic operation
4. Press the equals (=) button to perform the calculation
5. The result will be displayed on the screen
6. Use the decimal point (.) button for floating-point numbers

## Future Improvements
- Implement functionality for the On/Off radio buttons
- Add more advanced operations (square root, percentage, etc.)
- Implement keyboard input support
- Add error handling for invalid inputs or operations (e.g., division by zero)
- Improve the UI design and layout

## Contributing
Contributions to improve the project are welcome. Please feel free to fork the repository and submit pull requests.

## License
This project is open-source and available under the MIT License.
