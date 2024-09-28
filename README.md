# TECHNO STUDY Agile Software Testing Project - 2  
### DemoWebShop TR Sprint  
**Sprint Duration:** 1 week  

### Test Environment:  
- **URL:** [DemoWebShop Project](https://demowebshop.tricentis.com/)

## Project Overview  
The goal of this project is to create and manage an automation test project, incorporating the provided user stories. The project includes team collaboration, code management, and testing processes.

### Step 1: Creating User Stories and Task Assignments  
- Understand the provided user stories and create tasks for each story.  
- Open the tasks in **Jira** and discuss them during sprint meetings.  
- Prioritize the tasks in sprint meetings (Refinement / Sprint Planning) and assign story points.  
- Create a sprint backlog based on the number of team members and the tasks to be completed.  

### Step 2: Writing Test Scenarios  
- Write test scenarios using **Jira Xray** or **Zephyr** plugin.  
- Each scenario should include:
  - Scenario name
  - Description
  - Steps
  - Expected results  
- Refine the test scenarios during daily standup meetings.

### Step 3: Code Development and Test Execution  
- Set up a **GitHub repository** for the test code.  
- The Team Lead will create the **master branch** and set up **branch protection rules**.  
- Team members clone the master branch locally, create a new branch under their own name, and develop test code in their branch to avoid conflicts.  
- We will use an already developed web environment for testing:
  - [DemoWebShop](https://demowebshop.tricentis.com/).

### Step 4: Code Review and Merge Process  
- Each team member initiates a pull request to merge their changes into the master branch.  
- The Team Lead reviews the pull requests and may ask for corrections if necessary.  
- Code review is performed on each pull request, and once approved, the changes are merged into the master branch by the Team Lead.  
- Before any coding begins, each member should:
  1. Check the remote **GitHub repository** for the latest updates.
  2. Update their local master branch.
  3. Merge the updated master into their own branch to avoid conflicts.  
  **Note:** This step is **critical** to avoid an increase in conflicts.  

### Step 5: Post-Sprint Evaluation and Transfers  
- Conduct a **sprint retrospective** to assess what went well and what can be improved.  
- Optionally, complex or incomplete user stories can be transferred to the next sprint.  
- Share the GitHub repository link and Jira board screenshots in communication channels like **Discord**.  
- Tag mentors and teachers when sharing updates.

### Support and Mentorship  
- Team members can request help from the Team Lead or use communication channels for assistance.  
- If needed, create "Knowledge Transfer" (KT) requests via Discord or other platforms and tag team members and mentors for help. Mentors will provide guidance and share knowledge.

## User Stories & Acceptance Criteria

Below are the user stories from **DemoWebShop** and their corresponding acceptance criteria:

1. **US_201: Register User**
   - **As a user**, I should be able to register to the web store to shop and access features.
   - **Acceptance Criteria**:
     - Register button on the homepage.
     - Registration fields for Name, Surname, Gender, Email, Password, and Confirmation.
     - Successful registration and confirmation message.
     - Password must be at least 6 characters long.

2. **US_202: Negative | Register User**
   - **As a user**, I want to receive an error when trying to register with an existing email address.
   - **Acceptance Criteria**:
     - Error message "The Specified Email Already Exists" should be displayed.

3. **US_203: Logout**
   - **As a user**, I should be able to logout to ensure a safer shopping experience.
   - **Acceptance Criteria**:
     - User should be redirected to the login page after successful logout.

4. **US_204: Login**
   - **As a user**, I should be able to log in to manage my account and shop.
   - **Acceptance Criteria**:
     - Login button should be available on the homepage.
     - Successful login with valid email and password.

5. **US_205: Negative | Login**
   - **As a user**, I want to test various negative login scenarios.
   - **Acceptance Criteria**:
     - Error messages for empty fields, invalid emails, and passwords.

6. **US_206: Ordering**
   - **As a user**, I should be able to order products using a credit card.
   - **Acceptance Criteria**:
     - Add product to cart, select shipping options, and proceed with payment.
     - Verify the total price and complete the order.

7. **US_207: Survey Response**
   - **As a user**, I should be able to answer surveys and see results after logging in.
   - **Acceptance Criteria**:
     - Survey should be visible on the homepage.
     - User can submit an answer and view survey results.

8. **US_208: Negative | Using Coupons and Gift Cards**
   - **As a user**, I want to see an error when I try to use an invalid coupon or gift card.
   - **Acceptance Criteria**:
     - Error messages should be displayed for non-existent coupons and gift cards.

9. **US_209: Download the Order History**
   - **As a user**, I should be able to view and download my order history.
   - **Acceptance Criteria**:
     - Access order details and download invoices.

### Pre-Conditions for Testing  
- The browser (Chrome, Safari, or Firefox) should be installed and initiated.
- Internet access must be provided in the test environment.
- The user account must be successfully created and verified for login and ordering functionalities.
- Credit card details for testing (Visa: 4242 4242 4242 4242, Expiry: 01/32, CVC: 123) should be used for payment.
  
---

## Negative Scenarios
- Negative scenarios are critical for ensuring stability and reliability by simulating unexpected use cases or errors. These scenarios help improve the overall user experience by preventing potential issues.
- Always consider and plan for negative scenarios when preparing test cases.

---

## Technologies and Tools Used:
The basic technologies and tools to be used in this project include:

Java - Programming language
Selenium - Web browser automation
Apache POI - Library for reading and writing Excel files
Git & GitHub - Version control Systems
JIRA & Zephyr-Squad - Test management Tools
 

## Contributors

- [Abylmyrat](https://github.com/abdycoding) - Project Team Lead & QA Automation Engineer
- [Furkan Akalin](https://github.com/furkanakalin) - QA Automation Engineer
- [Yasemin Yıldırır](https://github.com/yaseyldrr) - QA Automation Engineer
- [Gulmeiram Kongurbayeva](https://github.com/Gul8) - QA Automation Engineer
- [Yeldar Zulyarov](https://github.com/Yeldar123) - QA Automation Engineer
- [Burak Bilgiç](https://github.com/lurall) - QA Automation Engineer
- [Mahir Özçelik](https://github.com/Mahir-Ozcelik) - QA Automation Engineer


