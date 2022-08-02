import random

data = [
    list("abcdefghijklmnopqrstuvwxyz"),
    list("ABCDEFGHIJKLMNOPQRSTUVWXYZ"),
    list("0123456789"),
    list("`~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?")
]

pass_count = 10
pass_len = 12

for n in range(pass_count):
    password = [
        random.choice(data[0]),
        random.choice(data[1]),
        random.choice(data[2]),
        random.choice(data[3])
    ]

    for x in range(pass_len-4):
        d = random.choice(data)
        c = random.choice(d)
        password.append(c)

    random.shuffle(password)

    password = "".join(password)

    print(password)
