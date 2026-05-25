# Project : System Health Dashboard
# Author : Samiksha Rani
# Description : A professional utility to monitor system time and project status.

import os
import platform
from datetime import datetime

def clear_screen():
    # Clears the terminal for a clean "Dashboard" look
    os.system('cls' if os.name == 'nt' else 'clear')

def show_dashboard():
    clear_screen()
    now = datetime.now()
    current_time = now.strftime("%H:%M:%S")
    current_date = now.strftime("%d-%B-%Y")

    print("="*40)
    print(f" SYSTEM DASHBOARD ")
    print("="*40)

    # 1. System Info 
    print(f"• Date:     {current_date}")
    print(f"• Time:     {current_time}")
    print(f"• Platform: {platform.system()} ({platform.machine()})")

    # 2. Daily Motivation
    print("-" * 40)
    print(" 💡 Welcome Back Quote:")
    print("    Consistency isn't about being perfect. ")
    print("    It's just about showing up today. ")

    # 3. Quick Links
    print("="*40)
    print("📂 Current Repo Scripts:")
    print(" [1] goal_tracker.py ")
    print(" [2] secret_vault.py")
    print(" [3] guess_game.py")
    print("="*40)

    # Simple, foolproof exit strategy
    input("\n👉 Press ENTER to close the dashboard... ")
     
# Run the dashboard safely
show_dashboard()
