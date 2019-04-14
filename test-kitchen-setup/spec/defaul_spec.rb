require_relative './spec_helper.rb'

describe 'my galaxy role' do
  describe group('baz') do
    it { should exist }
  end

  describe user('foobar') do
    it { should exist }
  end

  describe package('role-package') do
    it { should be_installed }
  end

  describe file('/etc/myapp/app.conf') do
    it { should be_file }
  end

  describe port(8000) do
    it { should be_listening }
  end

  describe process('myprocess') do
    it { should be_running }
  end
end
