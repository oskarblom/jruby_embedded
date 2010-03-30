require 'rubygems'
require 'sinatra/base'

class MyApp < Sinatra::Base

	get '/' do
		'Hello world!'
	end
	
end

MyApp.run! :host => 'localhost', :port => 9090