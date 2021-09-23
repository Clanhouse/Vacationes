import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import MainTemplate from 'components/templates/MainTemplate';
import LoginPage from 'views/LoginPage';
import RegisterPage from 'views/RegisterPage';
import HomePage from './HomePage';
import ForgotPasswordPage from './ForgotPasswordPage';
import FavoritesPage from './FavoritesPage';
import PageNotFound from './PageNotFound';

const App = () => {
  return (
    <Router>
      <MainTemplate>
        <Switch>
          <Route path="/login" exact>
            <LoginPage />
          </Route>
          <Route path="/register" exact>
            <RegisterPage />
          </Route>
          <Route path="/forgot-password" exact>
            <ForgotPasswordPage />
          </Route>
          <Route path="/favorites" exact>
            <FavoritesPage />
          </Route>
          <Route path="/notifications" exact>
            <p>notifications page</p>
          </Route>
          <Route path="/" exact>
            <HomePage />
          </Route>
          <Route component={PageNotFound} />
        </Switch>
      </MainTemplate>
    </Router>
  );
};

export default App;
