(window.webpackJsonp=window.webpackJsonp||[]).push([[144],{268:function(e,t,n){"use strict";n.r(t),n.d(t,"frontMatter",(function(){return i})),n.d(t,"metadata",(function(){return l})),n.d(t,"rightToc",(function(){return p})),n.d(t,"default",(function(){return b}));var r=n(1),a=n(9),o=(n(0),n(305)),i={id:"integrations",title:"Workflow Integrations"},l={id:"integrations",title:"Workflow Integrations",description:"## Workflow Integration (Maven, Github, CI/CD)",source:"@site/../docs/integration.md",permalink:"/docs/integrations",editUrl:"https://github.com/OpenAPITools/openapi-generator/edit/master/website/../docs/integration.md",lastUpdatedBy:"William Cheng",lastUpdatedAt:1589890665,sidebar:"docs",previous:{title:"Debugging",permalink:"/docs/debugging"},next:{title:"Guidelines For Contributing",permalink:"/docs/contributing"}},p=[{value:"Workflow Integration (Maven, Github, CI/CD)",id:"workflow-integration-maven-github-cicd",children:[{value:"Gradle Integration",id:"gradle-integration",children:[]},{value:"Maven Integration",id:"maven-integration",children:[]},{value:"sbt Integration",id:"sbt-integration",children:[]},{value:"Bazel Integration",id:"bazel-integration",children:[]},{value:"GitHub Integration",id:"github-integration",children:[]},{value:"CI/CD",id:"cicd",children:[]}]}],c={rightToc:p};function b(e){var t=e.components,n=Object(a.a)(e,["components"]);return Object(o.b)("wrapper",Object(r.a)({},c,n,{components:t,mdxType:"MDXLayout"}),Object(o.b)("h2",{id:"workflow-integration-maven-github-cicd"},"Workflow Integration (Maven, Github, CI/CD)"),Object(o.b)("h3",{id:"gradle-integration"},"Gradle Integration"),Object(o.b)("p",null,"See the ",Object(o.b)("a",Object(r.a)({parentName:"p"},{href:"https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator-gradle-plugin/README.adoc"}),"openapi-generator-gradle-plugin README")," for details related to configuring and using the Gradle Plugin."),Object(o.b)("p",null,"Supported tasks include:"),Object(o.b)("ul",null,Object(o.b)("li",{parentName:"ul"},"Listing generators"),Object(o.b)("li",{parentName:"ul"},"Validation of Open API 2.0 and 3.0 Specs"),Object(o.b)("li",{parentName:"ul"},'Generating "Meta" generators'),Object(o.b)("li",{parentName:"ul"},"Generating all generators supported by OpenAPI Generator")),Object(o.b)("h3",{id:"maven-integration"},"Maven Integration"),Object(o.b)("p",null,"See the ",Object(o.b)("a",Object(r.a)({parentName:"p"},{href:"https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator-maven-plugin/README.md"}),"openapi-generator-maven-plugin README")," for details related to configuring and using the Maven Plugin."),Object(o.b)("h3",{id:"sbt-integration"},"sbt Integration"),Object(o.b)("p",null,"Please refer to ",Object(o.b)("a",Object(r.a)({parentName:"p"},{href:"https://github.com/upstart-commerce/sbt-openapi-generator"}),"https://github.com/upstart-commerce/sbt-openapi-generator")),Object(o.b)("h3",{id:"bazel-integration"},"Bazel Integration"),Object(o.b)("p",null,"Please refer to ",Object(o.b)("a",Object(r.a)({parentName:"p"},{href:"https://github.com/OpenAPITools/openapi-generator-bazel"}),"https://github.com/OpenAPITools/openapi-generator-bazel")),Object(o.b)("h3",{id:"github-integration"},"GitHub Integration"),Object(o.b)("p",null,"To push the auto-generated SDK to GitHub, we provide ",Object(o.b)("inlineCode",{parentName:"p"},"git_push.sh")," to streamline the process. For example:"),Object(o.b)("p",null," 1) Create a new repository in GitHub (Ref: ",Object(o.b)("a",Object(r.a)({parentName:"p"},{href:"https://help.github.com/articles/creating-a-new-repository/"}),"https://help.github.com/articles/creating-a-new-repository/"),")"),Object(o.b)("p",null," 2) Generate the SDK"),Object(o.b)("pre",null,Object(o.b)("code",Object(r.a)({parentName:"pre"},{className:"language-sh"}),' java -jar openapi-generator-cli.jar generate \\\n -i modules/openapi-generator/src/test/resources/2_0/petstore.json -g perl \\\n --git-user-id "wing328" \\\n --git-repo-id "petstore-perl" \\\n --release-note "Github integration demo" \\\n -o /var/tmp/perl/petstore\n')),Object(o.b)("p",null," 3) Push the SDK to GitHub"),Object(o.b)("pre",null,Object(o.b)("code",Object(r.a)({parentName:"pre"},{className:"language-sh"}),"cd /var/tmp/perl/petstore\n/bin/sh ./git_push.sh\n")),Object(o.b)("h3",{id:"cicd"},"CI/CD"),Object(o.b)("p",null,"Some generators also generate CI/CD configuration files (.travis.yml) so that the output will be ready to be tested by the CI (e.g. Travis)"),Object(o.b)("p",null,"If you're looking for the configuration files of a particular CI that is not yet supported, please open an ",Object(o.b)("a",Object(r.a)({parentName:"p"},{href:"https://github.com/openapitools/openapi-generator/issues/new"}),"issue")," to let us know."))}b.isMDXComponent=!0},305:function(e,t,n){"use strict";n.d(t,"a",(function(){return u})),n.d(t,"b",(function(){return d}));var r=n(0),a=n.n(r);function o(e,t,n){return t in e?Object.defineProperty(e,t,{value:n,enumerable:!0,configurable:!0,writable:!0}):e[t]=n,e}function i(e,t){var n=Object.keys(e);if(Object.getOwnPropertySymbols){var r=Object.getOwnPropertySymbols(e);t&&(r=r.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),n.push.apply(n,r)}return n}function l(e){for(var t=1;t<arguments.length;t++){var n=null!=arguments[t]?arguments[t]:{};t%2?i(Object(n),!0).forEach((function(t){o(e,t,n[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(n)):i(Object(n)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(n,t))}))}return e}function p(e,t){if(null==e)return{};var n,r,a=function(e,t){if(null==e)return{};var n,r,a={},o=Object.keys(e);for(r=0;r<o.length;r++)n=o[r],t.indexOf(n)>=0||(a[n]=e[n]);return a}(e,t);if(Object.getOwnPropertySymbols){var o=Object.getOwnPropertySymbols(e);for(r=0;r<o.length;r++)n=o[r],t.indexOf(n)>=0||Object.prototype.propertyIsEnumerable.call(e,n)&&(a[n]=e[n])}return a}var c=a.a.createContext({}),b=function(e){var t=a.a.useContext(c),n=t;return e&&(n="function"==typeof e?e(t):l({},t,{},e)),n},u=function(e){var t=b(e.components);return a.a.createElement(c.Provider,{value:t},e.children)},s={inlineCode:"code",wrapper:function(e){var t=e.children;return a.a.createElement(a.a.Fragment,{},t)}},g=Object(r.forwardRef)((function(e,t){var n=e.components,r=e.mdxType,o=e.originalType,i=e.parentName,c=p(e,["components","mdxType","originalType","parentName"]),u=b(n),g=r,d=u["".concat(i,".").concat(g)]||u[g]||s[g]||o;return n?a.a.createElement(d,l({ref:t},c,{components:n})):a.a.createElement(d,l({ref:t},c))}));function d(e,t){var n=arguments,r=t&&t.mdxType;if("string"==typeof e||r){var o=n.length,i=new Array(o);i[0]=g;var l={};for(var p in t)hasOwnProperty.call(t,p)&&(l[p]=t[p]);l.originalType=e,l.mdxType="string"==typeof e?e:r,i[1]=l;for(var c=2;c<o;c++)i[c]=n[c];return a.a.createElement.apply(null,i)}return a.a.createElement.apply(null,n)}g.displayName="MDXCreateElement"}}]);