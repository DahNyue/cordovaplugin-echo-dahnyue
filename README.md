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

cordova.apache's [Plugin Development Guide](https://cordova.apache.org/docs/en/latest/guide/hybrid/plugins/index.html#sample-javascript) → Publishing Plugins

Fortunately, This Repo. has it, too.

_**AND VERY IMPORTANT THING!**_

How use it?
This is "index.js" in *[project]/www*

<pre><code>
var app = {
    // Application Constructor
    initialize: function() {
        document.addEventListener('deviceready', this.onDeviceReady.bind(this), false);
    },
    // deviceready Event Handler
    //
    // Bind any cordova events here. Common events are:
    // 'pause', 'resume', etc.
    onDeviceReady: function() {
		echo.echo("I believe this is what you wanted.", function(result){
			alert(result);
		});
        this.receivedEvent('deviceready');
    },
    // Update DOM on a Received Event
    receivedEvent: function(id) {
        var parentElement = document.getElementById(id);
        var listeningElement = parentElement.querySelector('.listening');
        var receivedElement = parentElement.querySelector('.received');

        listeningElement.setAttribute('style', 'display:none;');
        receivedElement.setAttribute('style', 'display:block;');

        console.log('Received Event: ' + id);
    }
};
app.initialize();

</code></pre>

onDeviceReady's **echo.echo("I believe this is what you wanted.", function(result){
			alert(result);
		});**
