import pyzipper

zip_file = input("Zip File : ")
password_file = input("Password File : ")

with pyzipper.AESZipFile(zip_file,
    compression=pyzipper.ZIP_LZMA,
    encryption=pyzipper.WZ_AES) as zf:

    with open(password_file, "r") as pf:
        passfound = False

        for line in pf.readlines():
            password = line.strip()

            try:
                zf.setpassword(bytes(password, "utf-8"))
                zf.testzip()
                print(f"Password Ditemukan : {password}")
                passfound = True
                break
            except:
                continue

        if not passfound:
            print("Password Tidak Ditemukan")
    
