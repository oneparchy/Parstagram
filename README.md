# Project 3 - *Parstagram*

**Parstagram** is a photo sharing app similar to Instagram but using Parse as its backend.

## Instagram part 2

Time spent: **9** hours spent in total

## User Stories

The following **required** functionality is completed:

- [x] User can view the last 20 posts submitted to "Parstagram".
- [x] The user should switch between different tabs - viewing all posts (feed view), compose (capture photos form camera) and profile tabs (posts made) using fragments and a Bottom Navigation View. (2 points)
- [x] User can pull to refresh the last 20 posts submitted to "Instagram".

The following **optional** features are implemented:

- [x] User sees app icon in home screen and styled bottom navigation view
- [x] Style the feed to look like the real Instagram feed.
- [ ] User can load more posts once he or she reaches the bottom of the feed using infinite scrolling.
- [ ] Show the username and creation time for each post.
- [ ] User can tap a post to view post details, including timestamp and caption.
- [ ] User Profiles
      - [ ] Allow the logged in user to add a profile photo
      - [ ] Display the profile photo with each post
      - [ ] Tapping on a post's username or profile photo goes to that user's profile page and shows a grid view of the user's posts 
- [ ] User can comment on a post and see all comments for each post in the post details screen.
- [ ] User can like a post and see number of likes for each post in the post details screen.

The following **additional** features are implemented:

- [x] List anything else that you can get done to improve the app functionality!
- Added custom icon (royalty-free with annotation)

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='https://github.com/oneparchy/Parstagram/blob/master/RHP-CP_IG-part2.gif' title='Video Walkthrough' width='350' alt='Video Walkthrough' />

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Notes

Describe any challenges encountered while building the app.
- Had major issues trying to access the createdAt field in Back4App and convert it to a well-readable time format

## Open-source libraries used

- [Android Async HTTP](https://github.com/codepath/CPAsyncHttpClient) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Android

## Open-source images used

- [Letter P icon](https://www.flaticon.com/premium-icon/letter-p_3541242) - Minimialist icon by Md Tanvirul Haque

## License

    Copyright [yyyy] [name of copyright owner]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

## Instagram part 1

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