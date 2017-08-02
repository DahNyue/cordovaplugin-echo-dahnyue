# cordovaplugin-echo-dahnyue
Echo plugin for cordova at android

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

but, It("plugin add") needs 'package.json' made by npm packaging through plugman.
https://cordova.apache.org/docs/en/latest/guide/hybrid/plugins/index.html#sample-javascript >> Publishing Plugins

Fortunately, This Repo. has it, too.
