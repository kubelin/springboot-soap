# springboot-soap
this sample project for using soap protocol in spring3.0(jdk17)

SpringBoot-Soap is a project that implements SOAP communication using Spring Web Services and builds it with Gradle. The project uses JDK 17 and is built on SpringBoot 3.0.5.

Features:

Implements SOAP communication using Spring Web Services
Uses Apache CXF to convert WSDL to Java objects
Conducted tests for marshall, unmarshall, SOAP 1.1, and SOAP 1.2 using the BoxOffice WSDL URL.
To use the project, clone the repository and run it on a local server. The project can also be customized and built with different versions of SpringBoot or Gradle.

For more information, refer to the project's documentation and code.

## Quick start
1. download springboot-soap from git or download zip whatever
```bash
git clone https://github.com/kubelin/springboot-soap.git
```
2. build gradle
```bash
// for windows
cd 'projectfolder'
gradlew build
```

3. run junit or using call api ( ex) localhost:8080/soapTest )

## License
Copyright 2023 kubelin

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
