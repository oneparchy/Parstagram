# Project 3 - Parstagram

Parstagram is a photo sharing app similar to Instagram but using Parse as its backend.

Time spent 6 hours spent in total

## User Stories

The following required functionality is completed

- [x] User can sign up to create a new account using Parse authentication.
- [x] User can log in and log out of his or her account.
- [x] The current signed in user is persisted across app restarts.
- [x] User can take a photo, add a caption, and post it to Instagram.

The following optional features are implemented

- [ ] User sees app icon in home screen and styled bottom navigation view
- [ ] Style the feed to look like the real Instagram feed.
- [ ] After the user submits a new post, show an indeterminate progress bar while the post is being uploaded to Parse.

The following additional features are implemented

- [x] List anything else that you can get done to improve the app functionality!
- Password input field on Login Activity masks characters after they are entered
- Added a logout button on the main activity to allow users to logout/switch user
- Clear/Reset post text field & imageview image after successfully making a post
- Moved API keys to a separate file not published to git
- Each activity resizes automatically when the virtual keyboard is open

## Video Walkthrough

Here's a walkthrough of implemented user stories

<img src='https://github.com/oneparchy/Parstagram/blob/master/RHP-CP_IG-part1.gif' title='Video Walkthrough' width='350' alt='Video Walkthrough'><br> 

GIF created with [LiceCap](httpwww.cockos.comlicecap).

## Notes

Describe any challenges encountered while building the app.
- Some issues with Parse/Back4App, wasn't able to run a test API call because the button was greyed out, but other than that nothing major

## Open-source libraries used

- [Android Async HTTP](httpsgithub.comcodepathCPAsyncHttpClient) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](httpsgithub.combumptechglide) - Image loading and caching library for Android

## License

    Copyright [yyyy] [name of copyright owner]

    Licensed under the Apache License, Version 2.0 (the License);
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        httpwww.apache.orglicensesLICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an AS IS BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.