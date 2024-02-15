try:
    inputStr = input("input:")
    items = inputStr.split(" ")
    op = ""
    for x in items:

        if x == "a" or x == "b":
            op = x
        else:
            val = int(x)
            if op == "a":
                ret = ret + val
            elif op == "b":
                ret = ret - val
            else:
                ret = val
    print(ret)
except ValueError as error:
    print("Invalid input. ", error)
