import tkinter as tk
from tkinter import messagebox


# =========================================================
# BANK DATA
# =========================================================

balance = 1000


# =========================================================
# LOGIN FUNCTION
# =========================================================

def login():
    username = username_entry.get()
    password = password_entry.get()

    if username == "admin" and password == "1234":

        messagebox.showinfo(
            "Login Successful",
            "Welcome to Bank Services"
        )

        # Hide login frame
        login_frame.pack_forget()

        # Show bank dashboard
        bank_frame.pack(pady=20)

        welcome_label.config(
            text="Welcome, " + username
        )

        update_balance()

    else:
        messagebox.showerror(
            "Login Failed",
            "Invalid Username or Password"
        )


# =========================================================
# UPDATE BALANCE
# =========================================================

def update_balance():

    balance_label.config(
        text=f"Available Balance: ₹{balance}"
    )


# =========================================================
# CHECK BALANCE
# =========================================================

def check_balance():

    messagebox.showinfo(
        "Account Balance",
        f"Your available balance is ₹{balance}"
    )


# =========================================================
# DEPOSIT MONEY
# =========================================================

def deposit_money():

    global balance

    try:

        deposit = int(amount_entry.get())

        if deposit <= 0:

            messagebox.showwarning(
                "Invalid Amount",
                "Deposit amount must be greater than 0"
            )

            return

        balance = balance + deposit

        update_balance()

        messagebox.showinfo(
            "Deposit Successful",
            f"₹{deposit} deposited successfully.\n\n"
            f"Current Balance: ₹{balance}"
        )

        # Clear amount field
        amount_entry.delete(0, tk.END)

    except ValueError:

        messagebox.showerror(
            "Invalid Input",
            "Please enter a valid number"
        )


# =========================================================
# WITHDRAW MONEY
# =========================================================

def withdraw_money():

    global balance

    try:

        withdraw = int(amount_entry.get())

        if withdraw <= 0:

            messagebox.showwarning(
                "Invalid Amount",
                "Withdrawal amount must be greater than 0"
            )

        elif withdraw > balance:

            messagebox.showerror(
                "Insufficient Balance",
                "You don't have enough balance."
            )

        else:

            balance = balance - withdraw

            update_balance()

            messagebox.showinfo(
                "Withdrawal Successful",
                f"₹{withdraw} withdrawn successfully.\n\n"
                f"Current Balance: ₹{balance}"
            )

            amount_entry.delete(0, tk.END)

    except ValueError:

        messagebox.showerror(
            "Invalid Input",
            "Please enter a valid number"
        )


# =========================================================
# LOGOUT
# =========================================================

def logout():

    answer = messagebox.askyesno(
        "Logout",
        "Do you want to logout?"
    )

    if answer:

        # Hide bank dashboard
        bank_frame.pack_forget()

        # Clear login details
        username_entry.delete(0, tk.END)
        password_entry.delete(0, tk.END)
        amount_entry.delete(0, tk.END)

        # Show login page again
        login_frame.pack(pady=30)


# =========================================================
# EXIT APPLICATION
# =========================================================

def exit_app():

    answer = messagebox.askyesno(
        "Exit",
        "Do you want to exit Bank Services?"
    )

    if answer:

        messagebox.showinfo(
            "Bank Services",
            "Thank you for using our services."
        )

        root.destroy()


# =========================================================
# MAIN WINDOW
# =========================================================

root = tk.Tk()

root.title("Bank Management System")

root.geometry("550x600")

root.resizable(False, False)

root.configure(bg="#EAF2F8")


# =========================================================
# MAIN TITLE
# =========================================================

title = tk.Label(
    root,
    text="BANK MANAGEMENT SYSTEM",
    font=("Arial", 22, "bold"),
    bg="#1F618D",
    fg="white",
    width=30,
    pady=15
)

title.pack()


# =========================================================
# LOGIN FRAME
# =========================================================

login_frame = tk.Frame(
    root,
    bg="white",
    padx=30,
    pady=30
)

login_frame.pack(pady=40)


# Login heading

login_title = tk.Label(
    login_frame,
    text="User Login",
    font=("Arial", 20, "bold"),
    bg="white",
    fg="#1F618D"
)

login_title.grid(
    row=0,
    column=0,
    columnspan=2,
    pady=20
)


# Username label

username_label = tk.Label(
    login_frame,
    text="Username:",
    font=("Arial", 12),
    bg="white"
)

username_label.grid(
    row=1,
    column=0,
    padx=10,
    pady=10
)


# Username entry

username_entry = tk.Entry(
    login_frame,
    font=("Arial", 12),
    width=20
)

username_entry.grid(
    row=1,
    column=1,
    padx=10,
    pady=10
)


# Password label

password_label = tk.Label(
    login_frame,
    text="Password:",
    font=("Arial", 12),
    bg="white"
)

password_label.grid(
    row=2,
    column=0,
    padx=10,
    pady=10
)


# Password entry

password_entry = tk.Entry(
    login_frame,
    font=("Arial", 12),
    width=20,
    show="*"
)

password_entry.grid(
    row=2,
    column=1,
    padx=10,
    pady=10
)


# Login button

login_button = tk.Button(
    login_frame,
    text="LOGIN",
    font=("Arial", 12, "bold"),
    width=15,
    bg="#28B463",
    fg="white",
    command=login
)

login_button.grid(
    row=3,
    column=0,
    columnspan=2,
    pady=20
)


# =========================================================
# BANK DASHBOARD FRAME
# =========================================================

bank_frame = tk.Frame(
    root,
    bg="white",
    padx=40,
    pady=20
)


# Welcome label

welcome_label = tk.Label(
    bank_frame,
    text="Welcome User",
    font=("Arial", 18, "bold"),
    bg="white",
    fg="#1F618D"
)

welcome_label.pack(pady=10)


# Balance

balance_label = tk.Label(
    bank_frame,
    text=f"Available Balance: ₹{balance}",
    font=("Arial", 17, "bold"),
    bg="white",
    fg="#117864"
)

balance_label.pack(pady=15)


# Amount label

amount_label = tk.Label(
    bank_frame,
    text="Enter Amount",
    font=("Arial", 12),
    bg="white"
)

amount_label.pack(pady=5)


# Amount input

amount_entry = tk.Entry(
    bank_frame,
    font=("Arial", 14),
    width=20,
    justify="center"
)

amount_entry.pack(pady=10)


# =========================================================
# BUTTONS
# =========================================================

check_button = tk.Button(
    bank_frame,
    text="Check Balance",
    font=("Arial", 11, "bold"),
    width=22,
    bg="#3498DB",
    fg="white",
    command=check_balance
)

check_button.pack(pady=6)


deposit_button = tk.Button(
    bank_frame,
    text="Deposit Money",
    font=("Arial", 11, "bold"),
    width=22,
    bg="#28B463",
    fg="white",
    command=deposit_money
)

deposit_button.pack(pady=6)


withdraw_button = tk.Button(
    bank_frame,
    text="Withdraw Money",
    font=("Arial", 11, "bold"),
    width=22,
    bg="#F39C12",
    fg="white",
    command=withdraw_money
)

withdraw_button.pack(pady=6)


logout_button = tk.Button(
    bank_frame,
    text="Logout",
    font=("Arial", 11, "bold"),
    width=22,
    bg="#7D3C98",
    fg="white",
    command=logout
)

logout_button.pack(pady=6)


exit_button = tk.Button(
    bank_frame,
    text="Exit",
    font=("Arial", 11, "bold"),
    width=22,
    bg="#C0392B",
    fg="white",
    command=exit_app
)

exit_button.pack(pady=6)


# =========================================================
# RUN APPLICATION
# =========================================================

root.mainloop()
 