"""
    CHATBOT P.1

    >>> halo
    Bot : hai

    >>> selamat siang
    Bot : selamat siang

    >>> exit
    Bot : sampai jumpa lagi
"""

import re
import random

chat_data = [
    {
        "pattern": "halo|hai|helo|hei",
        "response": ["hai", "halo"]
    },
    {
        "pattern": "selamat (pagi|siang|sore|malam)",
        "response": ["selamat {1}"]
    },
    {
        "pattern" : "(apa|bagaimana) (kabar|kabarnya)",
        "response": ["saya baik-baik saja"]
    }
]

def get_bot_response(user_chat):
    bot_response = "maaf saya tidak mengerti"

    for data in chat_data:
        pattern = data["pattern"]
        res_re = re.match(pattern, user_chat)

        if res_re:
            bot_response = random.choice(data["response"]).format(0, *res_re.groups())
            break

    return bot_response

def main():
    is_exit = False

    while not is_exit:
        user_chat = input(">>> ")
        user_chat = user_chat.strip()
        user_chat = re.sub(r"\s\s+", " ", user_chat)

        bot_response = ""

        if user_chat == "exit":
            is_exit = True
            bot_response = "sampai jumpa lagi"
        else:
            bot_response = get_bot_response(user_chat)

        print(f"Bot : {bot_response}")

if __name__ == '__main__':
    main()
