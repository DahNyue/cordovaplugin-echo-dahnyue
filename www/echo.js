/*global cordova, module*/

module.exports = {
	echo: function (str, callback) {
		cordova.exec(callback, function(err) {
			callback('Nothing to echo.');
		}, "Echo", "echo", [str]);
	}	//.java Name, action value, argv
};
