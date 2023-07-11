const path = require("path");
const {merge} = require('webpack-merge');

const config = {
  entry: "./src/index.js",
  output: {
    path: path.resolve(__dirname, 'dist'),
    filename: "bundle.js",
  },
  module: {
    rules: [
      {
        test: /.*\.js$/,
        use: 'babel-loader',
        exclude: /node_modules/
      }
    ]
  }
};

module.exports = (env, argv) => {
  let modeConfig = {};
  if (argv.mode === 'development') {
    modeConfig = require('./webpack.dev.js');
  } else if (argv.mode === 'production') {
    modeConfig = require('./webpack.prod.js');
  }

  return merge(config, modeConfig);
};