## Bank Management System (Java)

This Java program simulates a simple bank management system where users can create accounts, log in, deposit or withdraw money, check balance, view transaction history, and edit their profile.

### Features:
1. **Create Bank Account**: 
   - Users can create a new account by providing personal details such as name, mobile number, Aadhaar, PAN card, address, and a security pin.
   - Users can also deposit an initial amount while creating the account.
   
2. **Login Module**:
   - Existing users can log in using their registered mobile number and pin.
   
3. **Home Page**:
   - After logging in, users can:
     - **Deposit Money**: Add funds to their account.
     - **Withdraw Money**: Withdraw funds (with pin validation).
     - **Check Balance**: Check current account balance.
     - **View Statement**: View a list of recent transactions.
     - **Edit Profile**: Update username, mobile number, address, or pin.
     - **Logout**: Exit the system.

4. **Transaction History**:
   - Users can view all deposits and withdrawals they've made, stored in the `statement` list.

### Important Data:
- **Account Number**: A constant account number assigned to each user (for demonstration purposes).
- **IFSC Code**: A predefined IFSC code for the bank (static).

This system uses basic loops, conditional statements, and array lists to manage user data and transactions. It operates in a console environment and handles inputs through the `Scanner` class.
