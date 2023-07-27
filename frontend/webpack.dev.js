const config = {
  mode: "development",
  devServer: {
    static: './dist',
    port: 3000,
    hot: false
  },
  devtool: 'source-map'
};

module.exports = config;