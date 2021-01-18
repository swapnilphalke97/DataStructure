giventext="asdfgyhbvfcdrfhyuiojnbgf"
pattern="bvfc"
for i in range(0,len(giventext)-1):
     if giventext[i]=="b":
        if giventext[i+1]=="v":
            if giventext[i+2]=="f":
                if giventext[i+3]=="c":
                    print("Your string is present in text at location %d" %i)

        