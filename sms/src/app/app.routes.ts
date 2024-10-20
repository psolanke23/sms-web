import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './features/home/home.component';
import { NgModule } from '@angular/core';
import { HeaderComponent } from './layouts/header/header.component';

export const routes: Routes = [
    {
        path: '',
        component: HeaderComponent,
        children: [
            { path: '', component: HomeComponent },
            { path: 'about-us', loadComponent: () => import('./features/about-us/about-us.component').then(c => c.AboutUsComponent) }
        ],
    },
    // { path: 'about-us', loadComponent: () => import('./features/about-us/about-us.component').then(c => c.AboutUsComponent) }
    { path: '**', redirectTo: '' }
];


@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule { }

