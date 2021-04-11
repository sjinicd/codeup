num= input()
a= num.split(".")
print("{0:%04d}.{1:%0.02d}.{2.%0.02d}".format(int(a[0]), int(a[1]), int(a[2])))
