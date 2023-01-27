import math
import sys

PI = 3.14159


# Calculate Palindromes
def is_palindrome(num):
    number_str = str(num)
    reverse = ""
    for digit in number_str:
        reverse = digit + reverse
    return reverse == number_str


# Calculate area of square
def area_square(width):
    return width * width


# Calculate area of circle
def area_circle(radius):
    return PI * (radius * radius)


# Display menu
def main():
    print("\nCalculations")
    print("------------------------------")
    print("1. Calculate area of a square")
    print("2. Calculate area of a circle")
    print("3. Display palindromes up to 1,000")
    print("4. Exit")


# Get user input
while True:
    main()
    option = int(input("\nEnter an option from 1-4: "))
    if option == 1:
        print("\n**** Area of a square ****")
        width = int(input("Enter width of square (cm): "))
        print("The area of a square of {}cm = {}cm squared".format(width, area_square(width)))
    elif option == 2:
        print("\n**** Area of a circle ****")
        radius = float(input("Enter radius of circle (cm): "))
        print("The area of a square of {}cm = {:.2f}cm squared".format(radius, area_circle(radius)))
    elif option == 3:
        print("\n**** Palindromes ****")
        for i in range(1001):
            if is_palindrome(i):
                print(i)
    elif option == 4:
        print("\nExiting the program")
        exit(0)
    else:
        print("Invalid option.\n")
        continue

if __name__ == "__main__":
    main()
