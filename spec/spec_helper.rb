# Set up simplecov
require 'simplecov'
SimpleCov.start { add_filter '/spec/' }

$LOAD_PATH.unshift File.expand_path('../../lib', __FILE__)
require 'magician'
