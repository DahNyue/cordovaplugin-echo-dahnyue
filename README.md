# cordovaplugin-echo-dahnyue
Echo plugin for cordova at android

	플러그인을 add 하기 위해서는 package.json파일이 필요하다.
	그것은 cordova.apache 웹사이트에서 찾을 수 있다.

First, Create Cordova Project.

	$ cordova create [FolderName] [PackageName] [ApplicationName]
	ex) cordova create echo com.example.echo Echo

and add platform.

	$ cordova platform add [Platform]
	ex) cordova platform add android
	
[Platform] = {ios, android, ... }

finally, add plugin.

	$ cordova plugin add [PluginPath]
	ex) cordova plugin add ../cordovaplugin-echo-dahnyue
	
[PluginPath] = {gitURL, npmPath, DirectoryPath}

but, It needs 'package.json' made by npm packaging through plugman.
https://cordova.apache.org/docs/en/latest/guide/hybrid/plugins/index.html#sample-javascript >> Publishing Plugins
