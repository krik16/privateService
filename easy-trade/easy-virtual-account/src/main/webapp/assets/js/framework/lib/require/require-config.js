App.root_directory = App['contextPath'] + '/assets/js/';

/** application目录 */
App.root_directory_a = App.root_directory + 'application/';
/** framework目录 */
App.root_directory_f = App.root_directory + 'framework/';
/** framework:lib */
App.root_directory_f_l = App.root_directory_f + 'lib/';
App.root_directory_f_l_j = App.root_directory_f_l + 'jquery/';
App.root_directory_f_l_b = App.root_directory_f_l + 'bootstrap/';

/** framework:widgets */
App.root_directory_f_w = App.root_directory_f + 'widgets/';
require.config({
	"map":{
		'*':{
			'css': App.root_directory_f_l + 'require/css/css.js'
		}
	},
	
	"paths":{
		'jQuery': App.root_directory_f_l_j + 'jquery',
		
		'bootstrap': App.root_directory_f_l_b + 'js/bootstrap.min',
		
		'form-util': App.root_directory_f_w + 'form-util',
		
		'eventAction-util': App.root_directory_f_w + 'eventAction-util',
		
		'application': App.root_directory_a + 'application'
	},
	
	"shim":{
		'jQuery':{
			'deps':[]
		},
		
		'bootstrap':{
			'deps':['jQuery', 'css!' + App.root_directory_f_l_b + 'css/bootstrap.css']
		},
		
		'form-util': {
			'deps': ['jQuery']
		},
		
		'eventAction-util': {
			'deps': ['jQuery']
		},
		
		'application': {
			'deps': ['form-util', 'eventAction-util']
		}
	}
});