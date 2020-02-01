# Kotlin MultiPlatform Examples

Main repository containing all the example apps demonstrating features/functionality/integrations using Kotlin MultiPlatfrom development.

## Example apps

1. [BasicKMPProject](/BasicKMPProject)

# Pull Requests

I welcome and encourage all pull requests. It usually will take me within 24-48 hours to respond to any issue or request. Here are some basic rules to follow to ensure timely addition of your request:

1. If its a feature, bugfix, or anything please only change code to what you specify.
1. Please keep PR titles easy to read and descriptive of changes, this will make them easier to merge :)
1. Pull requests _must_ be made against `develop` branch. Any other branch (unless specified by the maintainers) will get rejected.
1. Check for existing [issues](https://github.com/nisrulz/kmp-examples/issues) first, before filing an issue.
1. Make sure you follow the set standard as all other projects in this repo do
   - Use the package name of the format `github.nisrulz.example.*` where `*` is the example you are adding to the repo. I am trying to follow a set standard in the repo, please adhere to that.
1. Have fun!

## Extra

To download a specific example from this repo follow the steps below:

- Install `svn` using homebrew (mac/linux)
  ```bash
  brew install svn
  ```
- Copy the name of the example folder in this repo i.e `BasicKMPProject`
- Next replace `example_folder` in the below command:

  ```bash
  svn checkout https://github.com/nisrulz/kmp-examples/trunk/example_folder
  ```

  i.e Consider `BasicKMPProject` is the name of the example's folder, the command becomes:

  ```bash
  svn checkout https://github.com/nisrulz/kmp-examples/trunk/BasicKMPProject
  ```

- Done! You should have the specific example all checked out!

## Author & support

This project was created by [Nishant Srivastava](https://github.com/nisrulz/nisrulz.github.io#nishant-srivastava) but hopefully developed and maintained by many others. See the [the list of contributors here](https://github.com/nisrulz/kmp-examples/graphs/contributors).

If you appreciate my work, consider [buying me](https://www.paypal.me/nisrulz/5usd) a cup of :coffee: to keep me recharged :metal: [[PayPal](https://www.paypal.me/nisrulz/5usd)]

## License

```text
Copyright 2020 Nishant Srivastava

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
